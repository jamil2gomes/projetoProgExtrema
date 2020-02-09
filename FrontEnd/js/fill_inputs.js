function getApi() {
    let filtro = document.getElementById("buscaMono").value
    console.log(filtro)


    myRequest("http://localhost:8080/mono/" + filtro)
        .then(function(response) {
            var objects = JSON.parse(response);

            document.getElementById("dia").innerHTML = objects.dataDefesa.substring(0, 2)
            document.getElementById("mes").innerHTML = formataMes(objects.dataDefesa.substring(3, 5))
            document.getElementById("ano").innerHTML = objects.dataDefesa.substring(6, 10)
            document.getElementById("horario").innerHTML = objects.dataDefesa.substring(11)
            document.getElementById("aluno").innerHTML = objects.aluno.nome;
            document.getElementById("temaMono").innerHTML = objects.tema;
            document.getElementById("professores").innerHTML = objects.banca.bancaProfessor[0].id.professor.nome + ", " + objects.banca.bancaProfessor[1].id.professor.nome + ", " + objects.banca.bancaProfessor[2].id.professor.nome;
            document.getElementById("prof1").innerHTML = objects.banca.bancaProfessor[0].id.professor.nome;
            document.getElementById("prof2").innerHTML = objects.banca.bancaProfessor[1].id.professor.nome;
            document.getElementById("prof3").innerHTML = objects.banca.bancaProfessor[2].id.professor.nome;
            document.getElementById("nota1").innerHTML = objects.banca.bancaProfessor[0].nota.toFixed(2);
            document.getElementById("nota2").innerHTML = objects.banca.bancaProfessor[1].nota.toFixed(2);
            document.getElementById("nota3").innerHTML = objects.banca.bancaProfessor[2].nota.toFixed(2);
            document.getElementById("media").innerHTML = ((objects.banca.bancaProfessor[0].nota + objects.banca.bancaProfessor[1].nota + objects.banca.bancaProfessor[2].nota) / 3).toFixed(2);
            document.getElementById("situacao").innerHTML = objects.situacao
            document.getElementById("profOrientador").innerHTML = objects.banca.bancaProfessor[0].id.professor.nome;

        })
        .catch(function(error) {
            location.replace("notfound.html");
        });
}

function formataMes(valor) {
    let mes = {
        "01": "Janeiro",
        "02": "Fevereiro",
        "03": "Março",
        "04": "Abril",
        "05": "Maio",
        "06": "Junho",
        "07": "Julho",
        "08": "Agosto",
        "09": "Setembro",
        "10": "Outubro",
        "11": "Novembro",
        "12": "Dezembro"
    }

    return mes[valor];
}