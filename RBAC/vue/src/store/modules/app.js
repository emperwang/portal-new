export default {
    namespaced: true,
    state: {
        appName: "mango platform",  // 应用主题
        themeColor: "#14889A",   // 主题颜色
        oldThemeColor: "#14889A", // 上一次主题颜色
        collapse: false, // 导航栏收缩状态
    },
    getters: {
        collapse(state) { // 对应着上面的state
            return state.collapse
        }
    },
    mutations: {
        onCollapse(state) {
            state.collapse = !state.collapse;
        },
        setThemeColor(state, themeColor) { // 改变主题颜色
            state.oldThemeColor = state.themeColor
            state.themeColor = themeColor
        }
    },
    actions: {

    }
}