<%@page contentType="text/html" pageEncoding="UTF-8"%>


	<form method="post" action="customer/add.html">
		<table>
			<tbody>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="fname" size="10"/></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lname" size="10"/></td>
				</tr>
				<tr>
					<td>address:</td>
					<td><textarea rows="4" cols="50" name="address"></textarea></td>
				</tr>
				<tr>
					<td>Date:</td>
					<td><input type="date" name="date"/></td>
				</tr>
				<tr>
					<td>PassPort No:</td>
					<td><input type="text" name="passportno"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="submit"/></td>
				</tr>
			</tbody>
		</table>
	</form>

