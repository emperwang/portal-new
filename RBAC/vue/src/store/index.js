import Vue from 'vue'
import vuex from 'vuex'

Vue.use(vuex)

const store = new vuex.Store({
    modules: {
        app: app,
    }
})

export default store;

