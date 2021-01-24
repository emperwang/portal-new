import router from '.'

router.beforeEach((to, from, next) => {
    console.log("to matched: ", to.matched);
    console.log("to name: ", to.name);
    console.log("to fullpath: ", to.fullPath);
    console.log("to path: ", to.path);
    next();
})