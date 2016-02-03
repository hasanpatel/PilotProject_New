<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<body>
<script type="text/javascript">
function validateform(){
	
var errorFlag=false;
var fname=document.getElementById('fname').value;
var lname=document.getElementById('lname').value;
var address=document.getElementById('address').value;
var date=document.getElementById('date').value;
var passportno=document.getElementById('passportno').value;

if( fname == "" ){
	document.getElementById("fnameError").innerHTML = "Please enter your First Name";
	
	errorFlag=true;
}else
	{
	document.getElementById("fnameError").innerHTML = "";
	}

if( lname == "" ){
document.getElementById("lnameError").innerHTML = "Please enter your Last Name";
document.getElementById("lnameError").style.color='red'
errorFlag=true;
}else
	{
	document.getElementById("lnameError").innerHTML = "";
	}
if( address == "" ){
	document.getElementById("addressError").innerHTML = "Please enter your Address";
	document.getElementById("addressError").style.color='red'
	errorFlag=true;
	}else
		{
		document.getElementById("addressError").innerHTML = "";
		}
if( date == "" ){
	document.getElementById("dateError").innerHTML = "Please enter your Date Of Birth";
	document.getElementById("dateError").style.color='red'
	errorFlag=true;
	}else
		{
		document.getElementById("dateError").innerHTML = "";
		}
if( passportno == "" ){
	document.getElementById("passportnoError").innerHTML = "Please enter your Passport No";
	document.getElementById("passportnoError").style.color='red'
	errorFlag=true;
	}else
		{
		document.getElementById("passportnoError").innerHTML = "";
		}

if(errorFlag)
{

	return false;
}else
	return true;
}
</script>

	<form method="post" action="customer/add.html">
		<table>
			<tbody>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname" id="fname" size="10"/></td>
					<td><span id="fnameError"></span></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname" id="lname" size="10"/></td>
					<td><span id="lnameError"></span></td>
				</tr>
				<tr>
					<td>address:</td>
					<td><textarea rows="4" cols="50" name="address" id="address"></textarea></td>
					<td><span id="addressError"></span></td>
				</tr>
				<tr>
					<td>Date:</td>
					<td><input type="date" name="date" id="date"/></td>
					<td><span id="dateError"></span></td>
				</tr>
				<tr>
					<td>PassPort No:</td>
					<td><input type="text" name="passportno" id="passportno"/></td>
					<td><span id="passportnoError"></span></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="submit" onclick="return validateform();"/></td>
				</tr>
			</tbody>
		</table>
	</form>
	</body>
	</html>