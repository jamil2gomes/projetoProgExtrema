function myRequest(url, method = "GET") {
    return new Promise(function(resolve, reject) {

        var xmlhttp = new XMLHttpRequest();

        var newUrl = url

        xmlhttp.open(method, newUrl, true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send();

        xmlhttp.onreadystatechange = function() {
            if (xmlhttp.readyState === XMLHttpRequest.DONE) {
                if (xmlhttp.status === 200) {
                    resolve(xmlhttp.responseText);
                } else {
                    reject("Erro : " + xmlhttp.statusText);
                }
            }
        }
    });
}