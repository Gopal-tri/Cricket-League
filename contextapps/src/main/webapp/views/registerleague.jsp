<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheat" href="/include/includedesign.jsp">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.css">


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<jsp:include page="/include/menu.jsp"></jsp:include>
	</div>

	<div class="row">
		<div class="container">

			<form action="/registerleague" method="post">

				<div class="form-group row">
					<label for="textname" class="col-sm-2 form-control-label">Name</label>
					<div class="col-sm-10">
						<input type="Text" class="form-control" id="textname" name="name"
							placeholder="Name">
					</div>
				</div>

				<div class="form-group row">
					<label for="textdob" class="col-sm-2 form-control-label">Date
						of Birth</label>
					<div class="col-sm-10">
						<input type="Date" class="form-control" id="textdob" name="dob"
							placeholder="DOB">
					</div>
				</div>

				<div class="form-group row">
					<label for="textcontact" class="col-sm-2 form-control-label">Contact
					</label>
					<div class="col-sm-10">
						<input type="tel" class="form-control" id="textcontact"
							name="contact" placeholder="Contact Number">
					</div>
				</div>

				<div class="form-group row">
					<label for="textaddress" class="col-sm-2 form-control-label">Address</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="textaddress"
							name="address" placeholder="Address">
					</div>
				</div>

				<div class="form-group row">
					<label for="textemail" class="col-sm-2 form-control-label">Email</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="textemail"
							name="email" placeholder="EmailAddress">
					</div>
				</div>


				<div class="form-group row">
					<label for="textgender" class="col-sm-2 form-control-label">Gender</label>
					<div class="col-sm-10">

						<div class="form-check">
							<label class="form-check-label"> <input
								class="form-check-input" type="radio" name="male"
								id="exampleRadios1" value="male" checked=""> Male
							</label>
						</div>
						<div class="form-check">
							<label class="form-check-label"> <input
								class="form-check-input" type="radio" name="female"
								id="exampleRadios3" value="female"> Female
							</label>
						</div>
					</div>
				</div>

				<div class="form-group row">
					<label for="textleagues" class="col-sm-2 form-control-label">Leagues</label>

					<div class="form-group row">
						<div class="btn-group">
							<select name="leagues" class="btn btn-primary">
								<c:forEach var="league" items="${leagues}">
									<option>${league.getTitle()}-${league.getSeason()}-${league.getYear()}</option>
								</c:forEach>
							</select>
						</div>
					</div>

				</div>

				<div class="form-group row">
					<input type="submit" class="btn btn-primary">
				</div>
			</form>
		</div>
	</div>

	<div class="footer bg-primary">
		<jsp:include page="/include/footer.jsp"></jsp:include>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script
		src="https://unpkg.com/bootstrap-table@1.15.5/dist/bootstrap-table.min.js"></script>


</body>
</html>