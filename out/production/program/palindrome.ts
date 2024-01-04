function palin() {
    let  a, b, temp = 0;

    let no = 191;

    b = no;


    while (no > 0) {


        a = no % 10;
        console.log("a" + a);
        no = Math.floor(no / 10);
        console.log("no" + no);
        temp = temp * 10 + a;
        console.log("temp" + temp);

        console.log("================");
    }



    if (temp == b) {
        console.log("Palindrome number");
    }
    else {
        console.log("Not Palindrome number");
    }
}


palin();