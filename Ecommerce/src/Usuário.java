
public class Usu�rio {
	import  java.nio.charset.Charset ;
	import  java.time.LocalDate ;
	import  java.time.Period ;
	import  java.util.List ;
	import  java.util.Optional ;

	import  org.apache.commons.codec.binary.Base64 ;
	@@ -21,72 +22,86 @@

		@Autowired
		private  UsuarioRepository usuarioRepository;

		 codificador de string  p�blico ( String senha ) { 

			Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
			codificador de retorno . codificar (senha);
		 codificador BCryptPasswordEncoder privado =  new  BCryptPasswordEncoder ();

		/ **
		 * M�todo para criptografar a senha
		 * /
		 codificador de string  p�blico ( String senha ) { 

			codificador de retorno . codificar (senha);
		}

		public  Opcional < Usuario > cadastrarUsuario ( Usuario  usuario ) {
		/ **
		 * M�todo para listar todos os usu�rios
		 * /
		public  List < Usuario >  listarUsuarios () {

			if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ())
				lan�ar um  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usu�rio j� existe! " , null );
			retornar usuarioRepository . encontrar tudo();

			int idade =  Per�odo . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
		}

		/ **
		 * M�todo para buscar um usu�rio pelo Id
		 * /
		public  Opcional < Usuario > buscarUsuarioId ( long  id ) {

			retornar usuarioRepository . findById (id);

		}

		public  Opcional < Usuario >  cadastrarUsuario ( Usuario  usuario ) {

			if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ())
				lan�ar um  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usu�rio j� existe! " , null );

			/ **
			 * Clacula a idade do usu�rio e verifica se ele � maior de idade
			 * /
			int idade =  Per�odo . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();

			se (idade <  18 )
				lan�ar  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usu�rio � menor de idade! " , null );

			/ * Codificador BCryptPasswordEncoder = new BCryptPasswordEncoder ();
				
			String senhaEncoder = encoder.encode (usuario.getSenha ());
			usuario.setSenha (senhaEncoder); * /


			usuario . setSenha (codificador (usuario . getSenha ()));
			

			return  Opcional . de (usuarioRepository . save (usuario));
			

		}
		
		public  Opcional  < Usuario > atualizarUsuario ( Usuario  usuario ) {
			
			if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ()) {

		public  Opcional < Usuario >  atualizarUsuario ( Usuario  usuario )  {

			if  (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ()) {

				int idade =  Per�odo . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
				

				se (idade <  18 )
					lan�ar  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usu�rio � menor de idade! " , null );

				/ * Codificador BCryptPasswordEncoder = new BCryptPasswordEncoder ();
				
				String senhaEncoder = encoder.encode (usuario.getSenha ());
				usuario.setSenha (senhaEncoder); * /


				usuario . setSenha (codificador (usuario . getSenha ()));
				

				return  Opcional . de (usuarioRepository . save (usuario));
				

			} else {

				lan�ar  novo  ResponseStatusException ( HttpStatus . NOT_FOUND , " Usu�rio n�o encontrado! " , null );
				lan�ar um  novo  ResponseStatusException ( HttpStatus . NOT_FOUND , " O Usu�rio n�o encontrado! " , null );

			}

		}

		public  Opcional < UsuarioLogin > loginUsuario ( Opcional < UsuarioLogin > usuarioLogin ) {

			Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
			Opcional  < Usuario > usuario = usuarioRepository . findByUsuario (usuarioLogin . get () . getUsuario ());

			if (usuario . isPresent ()) {

				if (codificador . corresponde (usuarioLogin . get () . getSenha (), usuario . get () . getSenha ())) {

					String auth = usuarioLogin . get () . getUsuario () +  " : "  + usuarioLogin . get () . getSenha ();
					byte [] encodedAuth  =  Base64 . encodeBase64 (auth . getBytes ( Charset . forName ( " US-ASCII " )));
					String authHeader =  " B�sico "  +  nova  String ( encodedAuth );
					byte [] encodeAuth  =  Base64 . encodeBase64 (auth . getBytes ( Charset . forName ( " US-ASCII " )));
					String authHeader =  " B�sico "  +  nova  String ( encodeAuth );

					usuarioLogin . get () . setId (usuario . get () . getId ());
					usuarioLogin . get () . setNome (usuario . get () . getNome ());
	@@ -96,7 +111,11 @@ public String encoder (String senha) {
					return usuarioLogin;
				}
			}

			lan�ar um  novo  ResponseStatusException ( HttpStatus . UNAUTHORIZED , " Usu�rio ou Senha Inv�lidos! " , null );

			/ **
		 	* For�a o Lan�amento de uma Exce��o (Erro de excess�o)
		 	* /
			lan�ar um  novo  ResponseStatusException ( HttpStatus . UNAUTHORIZED , " O Usu�rio ou Senha Inv�lidos! " , null );
		}

	}
}
