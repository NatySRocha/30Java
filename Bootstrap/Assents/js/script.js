
let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailok = false
let assuntook = false
let mapa = document.querySelector ('#mapa')

nome.style.width = '100%'
email.style.width = '100%'


function validaNome() {

    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length <= 2){
        txtNome.innerHTML = 'Nome Inválido'
        txtNome.style.color = 'red'
       
    }else{
        txtNome.innerHTML = 'NomeVálido'  
        txtNome.style.color = 'green'
        nomeOk = true

    }
}

function validaEmail(){

 let txtEmail = document.querySelector('#txtEmail')
if(email.value.indexof('@') == -1 || email.value.indexof('.')){
    txtEmail.innerHTML = 'Email inválido'
    txtEmail.style.color = 'red'

}else{
    txtEmail.innerHTML = 'Nome Válido'
    txtEmail.style.color = 'green'
    emailok = true
}


}

function validaAssunto(){
    let txtAssunto = document.querySelector ('#assunto')
    if(assunto.value.length >= 10 ){
        txtAssunto.innerHTML = 'Texto muito grande,digite no máximo 100 caracteres.'
        txtAssunto.style.color = 'red'
        
    }else{
        
        txtAssunto.style.display = 'none'
        assuntook = true
    }
}
function enviar(){
    if (nomeOk == true && emailok == true && assuntook == true){
        alert ('Formulário enviado com sucesso')
    }else{
        alert ('Preencha o Formulário Corretamente')
    }
}
 function mapazoom(){
     mapa.style.width = '800px'
     mapa.style.heigth = '600px'
 }
 function mapanormal(){
    mapa.style.width = '400px'
    mapa.style.heigth = '250px'

 }