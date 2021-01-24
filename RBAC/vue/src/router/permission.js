import router from '.'

router.beforeEach((to, from, next) => {
    //console.log("to matched: ", to.matched)
    next();
})
