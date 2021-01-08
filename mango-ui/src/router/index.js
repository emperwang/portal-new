import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/views/HelloWorld'
import Login from '@/views/Login'
import Notfound from '@/views/404'
import Home from '@/views/Home'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/login',
      name:'Login',
      component: Login
    },
    {
      path: '/404',
      name:'Notfound',
      component:Notfound
    }
  ]
})
