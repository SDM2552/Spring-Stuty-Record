const wrap = document.querySelector("#wrap");
const box = wrap.querySelector("article");

wrap.addEventListener("click", () => {
    let isOn = wrap.classList.contains("on");
    console.log(isOn);

    (isOn) ? wrap.classList.remove("on") : wrap.classList.add("on");
});