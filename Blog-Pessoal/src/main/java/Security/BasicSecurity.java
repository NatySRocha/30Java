package Security;

public class BasicSecurity {
	package  org.generation.blogPessoal.security ;

	import  org.springframework.beans.factory.annotation.Autowired ;
	import  org.springframework.context.annotation.Bean ;
	import  org.springframework.http.HttpMethod ;
	import  org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder ;
	import  org.springframework.security.config.annotation.web.builders.HttpSecurity ;
	import  org.springframework.security.config.annotation.web.configuration.EnableWebSecurity ;
	import  org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter ;
	import  org.springframework.security.config.http.SessionCreationPolicy ;
	import  org.springframework.security.core.userdetails.UserDetailsService ;
	import  org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder ;
	import  org.springframework.security.crypto.password.PasswordEncoder ;

	@EnableWebSecurity
	public  class  BasicSecurityConfig  extends  WebSecurityConfigurerAdapter {

		@Autowired
		private  UserDetailsService userDetailsService;

		@Sobrepor
		protected  void  configure ( AuthenticationManagerBuilder  auth ) lança  Exception {
			auth . userDetailsService (userDetailsService);

			auth . inMemoryAuthentication () . withUser ( " root " ) . senha (passwordEncoder () . encode ( " root " ))
	.authorities 				( " ROLE_USER " );
		}

		@Feijão
		public  PasswordEncoder  passwordEncoder () {
			retornar  novo  BCryptPasswordEncoder ();
		}

		@Sobrepor
		protected  void  configure ( HttpSecurity  http ) lança  Exception {

			http . authorizeRequests () . antMatchers ( " / usuarios / logar " ) . permitAll () . antMatchers ( " / usuarios / cadastrar " )
					.permitAll () . antMatchers ( HttpMethod . OPÇÕES ) . permitAll () . anyRequest () . autenticado () . e () . httpBasic ()
					.e () . sessionManagement () . sessionCreationPolicy ( SessionCreationPolicy . SEM ESTADOS ) . e () . cors () . e()
					.csrf () . desativar ();

		}

	}
}
