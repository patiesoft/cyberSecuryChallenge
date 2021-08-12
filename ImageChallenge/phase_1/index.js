const Jimp = require('jimp');
const WIDTH = 960;
const HEIGHT = 640;
let a,b,c,d,y;


async function readImages(){
    
    d = new Jimp(WIDTH, HEIGHT);
    a = await Jimp.read('a.png');
    b = await Jimp.read('b.png');
    c = await Jimp.read('c.png');
    y = await Jimp.read('y.png');
    // a.greyscale()
    // b.greyscale()
    // c.greyscale()
    // y.greyscale()

}

readImages().then(()=>{
    
    
    for(let X=0;X<WIDTH;X++){
        for(let Y=0;Y<HEIGHT;Y++){
            let hex = y.getPixelColor(X, Y) + 41 * c.getPixelColor(X, Y) - 3 * b.getPixelColor(X, Y) - 21 * a.getPixelColor(X, Y);
            console.log(`hex:${hex} x:${X} y:${Y}`)
            d.setPixelColor(hex%4294967295, X, Y);
        }
    }
d.write('d.png')

})




