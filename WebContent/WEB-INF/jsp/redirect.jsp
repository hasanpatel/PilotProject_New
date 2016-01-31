<%@page import="com.data.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<table>
	<thead>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Address</th>
		<th>DOB</th>
		<th>Passport No</th>
		
	</thead>
			<tbody>
				<%
					try{
						ArrayList<Customer> customers=(ArrayList<Customer>)request.getAttribute("customers");
				%>
				
				<% for(Customer cust : customers)
					{
					%>
					<tr>
						<td><%= cust.getFname() %></td>
						<td><%= cust.getLname() %></td>
						<td><%= cust.getAddress() %></td>
						<td><%= cust.getDob() %></td>
						<td><%= cust.getPassport_No() %></td>
					</tr>
					<%} 
					}catch(Exception e)
					{
						System.out.println(e.getMessage());
					}%>
			</tbody>
	</table>
