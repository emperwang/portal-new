import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import Login from '@/views/Login'
import notFound from '@/views/404'
import Vcarousel from '@/components/Vcarousels'
import vbutton from '@/components/vbutton'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: "/",
      name: 'Vcarousels',
      component: Vcarousel
    },
    { path: "/vbutton", name: "vbutton", component: vbutton },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/',
      name: 'notFound',
      component: notFound
    }
  ]
})
