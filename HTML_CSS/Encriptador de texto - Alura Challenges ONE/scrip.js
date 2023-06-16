function codificador() {
    let textoIn = document.getElementById("cuadro-texto").value;
    let textoSeparado = textoIn.split("");

    for (let i = 0; i < textoSeparado.length; i++) {
        if (textoSeparado[i] == "a") {
            textoSeparado[i] = "ai";
        }
        else if (textoSeparado[i] == "e") {
            textoSeparado[i] = "enter";
        }
        else if (textoSeparado[i] == "i") {
            textoSeparado[i] = "imes";
        }
        else if (textoSeparado[i] == "o") {
            textoSeparado[i] = "ober";
        }
        else if (textoSeparado[i] == "u") {
            textoSeparado[i] = "ufat";
        }
        else if (textoSeparado[i] == "") {
            textoSeparado[i] = " ";
        }
    }

    let textoUnido = textoSeparado.join("");
    // console.log(textoUnido);
    document.getElementById("mensaje-cod").style.display = "block";
    document.getElementById("mensaje-modificado").innerHTML = "";
    document.getElementById("cuadro-texto").value = "";
    document.getElementById("mensaje-modificado").innerHTML = textoUnido;
}

function decodificador() {
    let textoIn = document.getElementById("cuadro-texto").value;
    let textoSeparado = textoIn.split("");

    for (let i = 0; i < textoSeparado.length; i++) {
        if (textoSeparado[i] == "a") {
            for (let y = 1; y < 2; y++) {
                textoSeparado[i + y] = "";
            }
        }
          else if (textoSeparado[i] == "e") {
              for(let y = 1; y < 5; y++){
                textoSeparado[i+y] = "";
              }   
         }
         else if (textoSeparado[i] == "i") {
            for(let y = 1; y < 4; y++){
                textoSeparado[i+y] = "";
              }
         }
        else if (textoSeparado[i] == "o") {

            for (let y = 1; y < 4; y++) {
                textoSeparado[i + y] = "";
            }
        }
         else if (textoSeparado[i] == "u") {
            for(let y = 1; y < 4; y++){
                textoSeparado[i+y] = "";
              }
         }
         else if (textoSeparado[i] == " ") {
             textoSeparado[i] = " ";
         }
    }

    let textoUnido = textoSeparado.join("");
    // console.log(textoUnido);
    document.getElementById("mensaje-cod").style.display = "block";
    document.getElementById("mensaje-modificado").innerHTML = "";
    document.getElementById("cuadro-texto").value = "";
    document.getElementById("mensaje-modificado").innerHTML = textoUnido;
}

function copy() {
    let copyText = document.getElementById("mensaje-modificado");
    navigator.clipboard.writeText(copyText.innerHTML);
  }