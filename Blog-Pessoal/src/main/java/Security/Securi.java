package Security;

public class Securi {
	package  org.generation.blogPessoal.security ;

	import  java.util.Collection ;

	import  org.generation.blogPessoal.model.User ;
	import  org.springframework.security.core.GrantedAuthority ;
	import  org.springframework.security.core.userdetails.UserDetails ;

	public  class  UserDetailsImpl  implementa  UserDetails {

		private  static  final  long serialVersionUID =  1L ;

		 nome de usuário String privado ;
		 senha String privada ;
		 autoridades de coleta privada < GrantedAuthority > ;

		public  UserDetailsImpl ( usuário  usuario ) {
			isso . username = usuario . getUsername ();
			isso . senha = usuario . getSenha ();
		}

		public  UserDetailsImpl () {

		}

		@Sobrepor
		 Coleção  pública <? extends GrantedAuthority > getAuthorities () {
			autoridades de retorno ;
		}

		@Sobrepor
		public  String  getPassword () {
			senha de retorno ;
		}

		@Sobrepor
		public  String  getUsername () {
			return username;
		}

		@Sobrepor
		public  boolean  isAccountNonExpired () {
			return  true ;
		}

		@Sobrepor
		public  boolean  isAccountNonLocked () {
			return  true ;
		}

		@Sobrepor
		public  boolean  isCredentialsNonExpired () {
			return  true ;
		}

		@Sobrepor
		public  boolean  isEnabled () {
			return  true ;
		}

	}

}
