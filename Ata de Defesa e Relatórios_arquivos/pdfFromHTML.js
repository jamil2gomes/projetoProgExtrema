function HTMLtoPDF() {
    var pdf = new jsPDF("landscape", "pt", "a4");
    source = $('#HTMLtoPDF').html();
    specialElementHandlers = {
        '#bypassme': function(element, renderer) {
            return true
        }
    }

    pdf.fromHTML(source, 0, 0, { 'width': document.offsetWidth, 'height': document.offsetHeight },
        function(dispose) {
            // dispose: object with X, Y of the last line add to the PDF
            //          this allow the insertion of new lines after html
            pdf.save('html2pdf.pdf');
        }
    );
}