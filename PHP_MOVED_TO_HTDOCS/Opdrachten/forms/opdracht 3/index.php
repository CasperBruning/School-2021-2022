<?php
if (isset($_POST['send'])) {
    $zoekArray = [4, 6, "appels", 8, "peren", 21, "volvo", 87];
    $text = $_POST['text'];
    foreach ($zoekArray as $text) {
        if ($zoekArray == $text) {
            echo "waar";
        } else "niet waar";
    }
    
}