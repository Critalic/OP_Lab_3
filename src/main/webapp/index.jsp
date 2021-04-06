<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Lab3</title>
</head>
<%
    // retrieve your list from the request, with casting
    ArrayList<ArrayList> list = (ArrayList<ArrayList>) request.getAttribute("superList");

%>
<body>
<form id="calculate" action="helloServlet" method="post">
    <div class="min-h-screen bg-gray-100 py-6 flex flex-col  sm:py-12">
        <div class = "grid grid-cols-2 gap-5">
            <div>
                <h1>Choose the formula</h1>
                <input type="radio" id="myCheckbox1" name="formula" value="1"/>
                <label for="myCheckbox1"><img src="Formulas\1.png" width=195 height=90" /></label> <br>
                <input type="radio" id="myCheckbox2" name="formula" value="2"/>
                <label for="myCheckbox1"><img src="Formulas\2.png" width=297 height=70" /></label> <br>
                <input type="radio" id="myCheckbox3" name="formula" value="3"/>
                <label for="myCheckbox1"><img src="Formulas\3.png" width=282 height=61" /></label> <br>
            </div>

            <div>
                <form>
                    <h1>Enter the variables</h1>
                    a: from<input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="aFrom" value="${aFrom}" />
                       to: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="aTo" value="${aTo}" />
                       step: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="aStep" value="${aStep}" /><br>

                    b: from<input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="bFrom" value="${bFrom}" />
                       to: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="bTo" value="${bTo}" />
                       step: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="bStep" value="${bStep}" /><br>

                    c: from<input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="cFrom" value="${cFrom}" />
                       to: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="cTo" value="${cTo}" />
                       step: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="cStep" value="${cStep}" /><br>

                    d: from<input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="dFrom" value="${dFrom}" />
                       to: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="dTo" value="${dTo}" />
                       step: <input class="shadow appearance-none border rounded py-2 px-3 text-grey-darker" type="text" name="dStep" value="${dStep}" /><br>
                    <button class = "bg-blue-300 text-x1 font-semibold px-4 py-1 rounded hover:bg-blue-800 hover:text-white " type="submit">Count</button>
                </form>
            </div>
        </div>

        <div class = "bg-gray-100 flex justify-center">
            <table class="border-separate border border-green-800 ...">
                <thead>
                <tr>
                    <th class="border border-green-600 ...">a</th>
                    <th class="border border-green-600 ...">b</th>
                    <th class="border border-green-600 ...">c</th>
                    <th class="border border-green-600 ...">d</th>
                    <th class="border border-green-600 ...">y</th>
                </tr>
                </thead>
                <tbody>
                <% int i=0;
                    if(list==null) {

                    } else {
                    while (i<list.size()) {

                %>
                <tr>
                    <td class="border border-green-600 ..."><% out.print(list.get(i).get(0)); %> </td>
                    <td class="border border-green-600 ..."><% out.print(list.get(i).get(1)); %></td>
                    <td class="border border-green-600 ..."><% out.print(list.get(i).get(2)); %></td>
                    <td class="border border-green-600 ..."><% out.print(list.get(i).get(3)); %></td>
                    <td class="border border-green-600 ..."><% out.print(list.get(i).get(4)); %></td>
                </tr>
                <% i++;
                    }
                    } %>
                </tbody>
            </table>
        </div>
    </div>
</form>
</body>
</html>