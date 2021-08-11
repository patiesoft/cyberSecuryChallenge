var unirest = require("unirest");

var req = unirest("POST", "http://46.101.134.129/epoch/epoch-a-lyptic.php");

req.headers({
	"postman-token": "11838a85-e8ad-07be-b275-87e6beea71b8",
	"accept-language": "en-GB,en-US;q=0.9,en;q=0.8",
	"accept-encoding": "gzip, deflate",
	referer: "http://46.101.134.129/epoch/",
	accept: "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
	"user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.131 Safari/537.36",
	"content-type": "application/x-www-form-urlencoded",
	dnt: "1",
	"upgrade-insecure-requests": "1",
	origin: "http://46.101.134.129",
	"cache-control": "no-cache",
	"content-length": "24",
	connection: "keep-alive",
	host: "46.101.134.129",
});

req.form({
	code: "magazine",
	date: "2038-01-19",
});

req.end(function (res) {
	if (res.error) throw new Error(res.error);

	console.log(res.body);
});
