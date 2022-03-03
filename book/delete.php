<?php

$id= $_REQUEST['id'];

 $conn=mysqli_connect("localhost","root","","dbs");

 if(!$conn){
 echo "connect erroor".mysqli_error($conn);
 }else{
     $sql="DELETE FROM book WHERE id='$id'";
     
 }
 if(mysqli_query($conn, $sql)){
     echo "deleted";
 }
 else{
     echo "not deleted".mysqli_error($conn);
 }
 mysqli_close($conn);
 ?>