document.getElementById("btn_iniciarsesion").addEventListener("click",iniciarsesion);
document.getElementById("btn_registrar").addEventListener("click",register);
var contenedor_login_register = document.querySelector(".registro");
var formulario_register = document.querySelector(".register");
var formulario_login= document.querySelector(".login");
var cajatrasera_login = document.querySelector(".t_log");
var cajatrasera_register = document.querySelector(".t_reg");



function iniciarsesion(){
    if(window.innerWidth>850){
     formulario_register.style.display="none";
    contenedor_login_register.style.left="10px";
    formulario_login.style.display="block";
    cajatrasera_register.style.opacity="1";
    cajatrasera_login.style.opacity="1";
      
    }else{
    formulario_register.style.display="none";
    contenedor_login_register.style.left="0px";
    formulario_login.style.display="block";
    cajatrasera_register.style.display="block";
    cajatrasera_login.style.display="none";
         
    }
    
}

function register(){
    if(window.innerWidth>850){
    formulario_register.style.display="block";
    contenedor_login_register.style.left="800px";
    formulario_login.style.display="none";
    cajatrasera_register.style.opacity="1";
    cajatrasera_login.style.opacity="1";
    }else{
    formulario_register.style.display="block";
    contenedor_login_register.style.left="0px";
    formulario_login.style.display="none";
    cajatrasera_register.style.display="block";
    cajatrasera_login.style.opacity="1";
    }
}