<?php


 $conn=mysqli_connect("localhost","root","","dbs");

 if(!$conn){
 echo "connect erroor".mysqli_error($conn);
 }else{
     $sql="SELECT * FROM book";
     
 }
 $result = mysqli_query($conn, $sql);
echo"<center><h1><u>Book Information</u></h1></center>";
  while($row = mysqli_fetch_assoc($result)) {
    echo $row['id'] . "\t" . $row['name'] . "\t" . $row['price']. "<br>";
  }

 mysqli_close($conn);
 ?>