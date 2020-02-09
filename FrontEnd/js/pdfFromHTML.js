function doCapture() {

    var pdf = new jsPDF("l", "px", "letter");
    source = $('#HTMLtoPDF').html();

    pdf.fromHTML(source, 0, 0, {
            'width': 2000,
            'height': 2000
        },
        function(dispose) {
            pdf.save('html2pdf.pdf');
        }
    );

}