<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Lead</title>
</head>
<body>

    <h2>New Lead Here</h2>
    <form action="saveLead" method="post">
        <table>
            <tr>
                <td><label for="firstName">First Name:</label></td>
                <td><input type="text" placeholder="Enter first name" id="firstName" name="firstName" /></td>
            </tr>
            <tr>
                <td><label for="lastName">Last Name:</label></td>
                <td><input type="text" placeholder="Enter last name" id="lastName" name="lastName" /></td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td><input type="text" placeholder="Enter email" id="email" name="email" /></td>
            </tr>
            <tr>
                <td><label for="mobile">Mobile:</label></td>
                <td><input type="text" placeholder="Enter mobile" id="mobile" name="mobile" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save" /></td>
            </tr>
        </table>
    </form>

    ${msg}

</body>
</html>
