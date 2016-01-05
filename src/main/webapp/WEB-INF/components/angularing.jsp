<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div ng-app="myapp">
	<div ng-controller="HelloController">
		<table class="table table-hover">
			<thead>
				<tr>
					<th class="text-center">Select All</th>
					<th class="text-center">Person Name</th>
					<th class="text-center">Address</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="person in persons">
					<td>
						<div class="checkbox text-center">
							<input type="checkbox" value="">
						</div>
					</td>
					<td>
						<input type="text" name="" id="input" class="form-control" value="{{person.personName}}" required="required" pattern="" title="">
					</td>
					<td>
						<input type="text" name="" id="input" class="form-control" value="{{person.address}}" required="required" pattern="" title="">
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>