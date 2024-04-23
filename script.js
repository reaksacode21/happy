const showBlessingsBtn = document.getElementById('showBlessings');
const blessingsDiv = document.getElementById('blessings');

const blessings = [
    'សូមជូនពរអ្នកកុំអោយគេបោកច្រើនពេក!',
    'កុំបោកគេពេកពៅប្រយត្ន័គេបោកវិញ!',
    'ជូនពរអោយមានសង្សារឆាប់!',
    'សូមជូនពរអោយអ្នកកុំស្រលាញ់គេម្នាក់ឯង!',
    'សូមជូនពរអោយអ្នកកុំអោយក្លាយធ្វើជាជនទី៣',
    'សូមជូនពរអោយអ្នកកុំស្រលាញ់សង្សារគេ',
    'មានសង្សារនៅ!',
    'សុំTelegram:you can contact me:097 6765 427 មិនឆាតមកប្រយត្ន័គ្មានអ្នកស្រលាញ់'
];
function test(){
        try{
            window.webkit.messageHandlers.test.postMessage("Hello, world!");
        }catch{

        }
        
        console.log("click")
    }
    function json(){
        var param = '{"eventName" : "fistCharge , "amount" : "200"}'
        try{
            window.webkit.messageHandlers.test.postMessage(param);
        }catch{

        }
         
        console.log(param)
    }
showBlessingsBtn.addEventListener('click', () => {
    const randomIndex = Math.floor(Math.random() * blessings.length);
    blessingsDiv.innerHTML = `<p>${blessings[randomIndex]}</p>`;
});
