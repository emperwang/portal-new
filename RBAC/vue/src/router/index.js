import Vue from 'vue'
import Router from 'vue-router'
import index from '@/views/layout/index'

Vue.use(Router)

export default new Router({
  routes: [
    { path: '/index', name: 'index', component: index },
    { path: '/', redirect: '/index' }
  ]
})