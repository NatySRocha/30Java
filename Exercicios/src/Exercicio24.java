
public class Exercicio24 { HELP.md
	alvo /
	! .mvn / wrapper / maven-wrapper.jar
	! ** / src / main / ** / target /
	! ** / src / test / ** / target /

	# ## STS ###
	.apt_generated
	.classpath
	.factorypath
	.projeto
	.definições
	.springBeans
	.sts4-cache

	# ## IntelliJ IDEA ###
	.ideia
	* .iws
	* .iml
	* .ipr

	# ## NetBeans ###
	/ nbproject / private /
	/ nbbuild /
	/ dist /
	/ nbdist /
	/ .nb-gradle /
	construir /
	! ** / src / main / ** / build /
	! ** / src / test / ** / build /

	# ## Código VS ###
	.vscode /
	 117  Game / .mvn / wrapper / MavenWrapperDownloader.java 
	@@ -0,0 +1,117 @@
	/ *
	 * Copyright 2007 - apresenta o autor ou autores originais.
	 *
	 * Licenciado sob a Licença Apache, Versão 2.0 (a "Licença");
	 * você não pode usar este arquivo, exceto em conformidade com a Licença.
	 * Você pode obter uma cópia da Licença em
	 *
	 * https://www.apache.org/licenses/LICENSE-2.0
	 *
	 * A menos que exigido pela lei aplicável ou acordado por escrito, software
	 * distribuído sob a Licença é distribuído "COMO ESTÁ",
	 * SEM GARANTIAS OU CONDIÇÕES DE QUALQUER TIPO, expressas ou implícitas.
	 * Consulte a Licença para as permissões específicas que regem o idioma e
	 * limitações sob a Licença.
	 * /
	import  java.net. * ;
	import  java.io. * ;
	import  java.nio.channels. * ;
	import  java.util.Properties ;

	public  class  MavenWrapperDownloader {

	    private  static  final  String  WRAPPER_VERSION  =  " 0.5.6 " ;
	    / **
	     * URL padrão para baixar o maven-wrapper.jar, se nenhum 'downloadUrl' for fornecido.
	     * /
	    private  static  final  String  DEFAULT_DOWNLOAD_URL  =  " https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/ "
	        +  WRAPPER_VERSION  +  " / maven-wrapper- "  +  WRAPPER_VERSION  +  " .jar " ;

	    / **
	     * Caminho para o arquivo maven-wrapper.properties, que pode conter uma propriedade downloadUrl para
	     * use em vez do padrão.
	     * /
	     String final estática  privada MAVEN_WRAPPER_PROPERTIES_PATH =   
	            " .mvn / wrapper / maven-wrapper.properties " ;

	    / **
	     * Caminho onde o maven-wrapper.jar será salvo.
	     * /
	     String final estática  privada MAVEN_WRAPPER_JAR_PATH =   
	            " .mvn / wrapper / maven-wrapper.jar " ;

	    / **
	     * Nome da propriedade que deve ser usada para substituir o url de download padrão do wrapper.
	     * /
	    private  static  final  String  PROPERTY_NAME_WRAPPER_URL  =  " wrapperUrl " ;

	    public  static  void  main ( String  args []) {
	        Sistema . para fora . println ( " - Downloader iniciado " );
	        Arquivo baseDirectory =  novo  arquivo (args [ 0 ]);
	        Sistema . para fora . println ( " - Usando o diretório base: "  + baseDirectory . getAbsolutePath ());

	        // Se o maven-wrapper.properties existir, leia e verifique se ele contém um personalizado
	        // parâmetro wrapperUrl.
	        Arquivo mavenWrapperPropertyFile =  novo  Arquivo (baseDirectory, MAVEN_WRAPPER_PROPERTIES_PATH );
	        String url =  DEFAULT_DOWNLOAD_URL ;
	        if (mavenWrapperPropertyFile . existe ()) {
	            FileInputStream mavenWrapperPropertyFileInputStream =  null ;
	            tente {
	                mavenWrapperPropertyFileInputStream =  new  FileInputStream (mavenWrapperPropertyFile);
	                Propriedades mavenWrapperProperties =  new  Properties ();
	                mavenWrapperProperties . load (mavenWrapperPropertyFileInputStream);
	                url = mavenWrapperProperties . getProperty ( PROPERTY_NAME_WRAPPER_URL , url);
	            } catch ( IOException e) {
	                Sistema . para fora . println ( " - ERROR carregando ' "  +  MAVEN_WRAPPER_PROPERTIES_PATH  +  " ' " );
	            } finalmente {
	                tente {
	                    if (mavenWrapperPropertyFileInputStream ! =  null ) {
	                        mavenWrapperPropertyFileInputStream . fechar();
	                    }
	                } catch ( IOException e) {
	                    // Ignorar ...
	                }
	            }
	        }
	        Sistema . para fora . println ( " - Baixando de: "  + url);

	        Arquivo outputFile =  novo  Arquivo (baseDirectory . GetAbsolutePath (), MAVEN_WRAPPER_JAR_PATH );
	        if ( ! outputFile . getParentFile () . exists ()) {
	            if ( ! outputFile . getParentFile () . mkdirs ()) {
	                Sistema . para fora . println (
	                        " - ERRO ao criar diretório de saída ' "  + outputFile . getParentFile () . getAbsolutePath () +  " ' " );
	            }
	        }
	        Sistema . para fora . println ( " -  Fazendo download para: " + outputFile . getAbsolutePath ());
	        tente {
	            downloadFileFromURL (url, outputFile);
	            Sistema . para fora . println ( " Concluído " );
	            Sistema . saída ( 0 );
	        } catch ( Throwable e) {
	            Sistema . para fora . println ( " - Erro ao baixar " );
	            e . printStackTrace ();
	            Sistema . saída ( 1 );
	        }
	    }

	    private  static  void  downloadFileFromURL ( String  urlString , File  destination ) throws  Exception {
	        if ( System . getenv ( " MVNW_USERNAME " ) ! =  null  &&  System . getenv ( " MVNW_PASSWORD " ) ! =  null ) {
	            String username =  System . getenv ( " MVNW_USERNAME " );
	            char [] senha =  Sistema . getenv ( " MVNW_PASSWORD " ) . toCharArray ();
	            Autenticador . setDefault ( new  Authenticator () {
	                @Sobrepor
	                protected  PasswordAuthentication  getPasswordAuthentication () {
	                    retornar uma  nova  PasswordAuthentication (nome de usuário, senha);
	                }
	            });
	        }
	        URL site =  novo  URL (urlString);
	        ReadableByteChannel rbc;
	        rbc =  Canais . newChannel (site . openStream ());
	        FileOutputStream fos =  novo  FileOutputStream (destino);
	        fos . getChannel () . transferFrom (rbc, 0 , Long . MAX_VALUE );
	        fos . fechar();
	        rbc . fechar();
	    }

	}

}
