<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <span style="color: ${cookie.color.value}">Hello</span>
    <form method="post" action="/home">
        <label for="color">
            <select id="color" name="color">
                <option value="red">Red</option>
                <option value="black">Black</option>
                <option value="white">White</option>
                <option value="green">Green</option>
            </select>
        </label>
        <input type="submit" value="Color send">
    </form>
</body>
</html>
