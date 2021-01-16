export default {
    state: {
        appName: "mango platform",  // 应用主题
        themColor: "#14889A",   // 主题颜色
        oldThemeColor: "#14889A", // 上一次主题颜色
        collapse: false, // 导航栏收缩状态
        menuRouteLoaded: false // 菜单和路由是否已经加载
    },
    getters: {
        collapse(state) { // 对应着上面的state
            return state.collapse
        }
    },
    mutations: {
        onCollapse(state){
            state.collapse = !state.collapse;
        },
        setThemeColor(state, themColor) { // 改变主题颜色
            state.oldThemeColor = state.themColor
            state.themColor = themColor
        }
    },
    actions:{
        
    }
}