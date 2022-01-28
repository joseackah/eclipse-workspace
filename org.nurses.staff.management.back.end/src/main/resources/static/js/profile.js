// Get the modal
var modal = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}




// Load google charts
google.charts.load('current', {
    'packages': ['corechart']
});
google.charts.setOnLoadCallback(drawChart);

// Draw the chart and set the chart values
function drawChart() {
    var data = google.visualization.arrayToDataTable([
        ['Task', 'Hours per Day'],
      /*  ['Year 1', ${countYear1}],*/
        ['Year 2', 2],
        ['Year 3', 4],
        ['Total P.', 2],
        ['Sleep', 8]
    ]);

    // Optional; add a title and set the width and height of the chart
    var options = {
        'title': 'BIPS POPULATION',
        'width': 550,
        'height': 400
    };

    // Display the chart inside the <div> element with id="piechart"
    var chart = new google.visualization.PieChart(document
        .getElementById('piechart'));
    chart.draw(data, options);
}



function myFunction() {
    var x = document.getElementById("demo");
    if (x.className.indexOf("w3-show") == -1) {
        x.className += " w3-show";
    } else {
        x.className = x.className.replace(" w3-show", "");
    }
}