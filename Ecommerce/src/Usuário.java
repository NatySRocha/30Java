
public class Usuário {
	import  java.nio.charset.Charset ;
	import  java.time.LocalDate ;
	import  java.time.Period ;
	import  java.util.List ;
	import  java.util.Optional ;

	import  org.apache.commons.codec.binary.Base64 ;
	@@ -21,72 +22,86 @@

		@Autowired
		private  UsuarioRepository usuarioRepository;

		 codificador de string  público ( String senha ) { 

			Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
			codificador de retorno . codificar (senha);
		 codificador BCryptPasswordEncoder privado =  new  BCryptPasswordEncoder ();

		/ **
		 * Método para criptografar a senha
		 * /
		 codificador de string  público ( String senha ) { 

			codificador de retorno . codificar (senha);
		}

		public  Opcional < Usuario > cadastrarUsuario ( Usuario  usuario ) {
		/ **
		 * Método para listar todos os usuários
		 * /
		public  List < Usuario >  listarUsuarios () {

			if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ())
				lançar um  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usuário já existe! " , null );
			retornar usuarioRepository . encontrar tudo();

			int idade =  Período . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
		}

		/ **
		 * Método para buscar um usuário pelo Id
		 * /
		public  Opcional < Usuario > buscarUsuarioId ( long  id ) {

			retornar usuarioRepository . findById (id);

		}

		public  Opcional < Usuario >  cadastrarUsuario ( Usuario  usuario ) {

			if (usuarioRepository . findByUsuario (usuario . getUsuario ()) . isPresent ())
				lançar um  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usuário já existe! " , null );

			/ **
			 * Clacula a idade do usuário e verifica se ele é maior de idade
			 * /
			int idade =  Período . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();

			se (idade <  18 )
				lançar  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usuário é menor de idade! " , null );

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

				int idade =  Período . entre (usuario . getDataNascimento (), LocalDate . now ()) . getYears ();
				

				se (idade <  18 )
					lançar  novo  ResponseStatusException ( HttpStatus . BAD_REQUEST , " O Usuário é menor de idade! " , null );

				/ * Codificador BCryptPasswordEncoder = new BCryptPasswordEncoder ();
				
				String senhaEncoder = encoder.encode (usuario.getSenha ());
				usuario.setSenha (senhaEncoder); * /


				usuario . setSenha (codificador (usuario . getSenha ()));
				

				return  Opcional . de (usuarioRepository . save (usuario));
				

			} else {

				lançar  novo  ResponseStatusException ( HttpStatus . NOT_FOUND , " Usuário não encontrado! " , null );
				lançar um  novo  ResponseStatusException ( HttpStatus . NOT_FOUND , " O Usuário não encontrado! " , null );

			}

		}

		public  Opcional < UsuarioLogin > loginUsuario ( Opcional < UsuarioLogin > usuarioLogin ) {

			Codificador BCryptPasswordEncoder =  new  BCryptPasswordEncoder ();
			Opcional  < Usuario > usuario = usuarioRepository . findByUsuario (usuarioLogin . get () . getUsuario ());

			if (usuario . isPresent ()) {

				if (codificador . corresponde (usuarioLogin . get () . getSenha (), usuario . get () . getSenha ())) {

					String auth = usuarioLogin . get () . getUsuario () +  " : "  + usuarioLogin . get () . getSenha ();
					byte [] encodedAuth  =  Base64 . encodeBase64 (auth . getBytes ( Charset . forName ( " US-ASCII " )));
					String authHeader =  " Básico "  +  nova  String ( encodedAuth );
					byte [] encodeAuth  =  Base64 . encodeBase64 (auth . getBytes ( Charset . forName ( " US-ASCII " )));
					String authHeader =  " Básico "  +  nova  String ( encodeAuth );

					usuarioLogin . get () . setId (usuario . get () . getId ());
					usuarioLogin . get () . setNome (usuario . get () . getNome ());
	@@ -96,7 +111,11 @@ public String encoder (String senha) {
					return usuarioLogin;
				}
			}

			lançar um  novo  ResponseStatusException ( HttpStatus . UNAUTHORIZED , " Usuário ou Senha Inválidos! " , null );

			/ **
		 	* Força o Lançamento de uma Exceção (Erro de excessão)
		 	* /
			lançar um  novo  ResponseStatusException ( HttpStatus . UNAUTHORIZED , " O Usuário ou Senha Inválidos! " , null );
		}

	}
}
