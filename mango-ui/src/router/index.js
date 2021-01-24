import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import Login from '@/views/Login'
import notFound from '@/views/404'
import Vcarousel from '@/components/Vcarousels'
import vbutton from '@/components/vbutton'
import vlink from '@/components/vlink'
import vradio from '@/components/vradio'
import vcheckbox from '@/components/vcheckbox'
import vinput from '@/components/vinput'
import vinputnumber from '@/components/vinputnumber'
import vselect from '@/components/vselect'
import vcascader from '@/components/vcascader'
import vswtch from '@/components/vswitch'
import vslider from '@/components/vslider'
import vtimepicker from '@/components/vtimepicker'
import vdatepicker from '@/components/vdatepicker'
import vupload from '@/components/vupload'
import vrate from '@/components/vrate'
import vcolorpicker from '@/components/vcolorpicker'
import vtransfer from '@/components/vtransfer'
import vform from '@/components/vform'
import vtable from '@/components/vtable'
import vtag from '@/components/vtag'
import vprocess from '@/components/vprocess'
import vtree from '@/components/vtree'
import vpagination from '@/components/vpagination'
import vbadge from '@/components/vbadge'
import vavatar from '@/components/vavatar'
import valert from '@/components/vAlter'
import vloading from '@/components/vloading'
import vmessage from '@/components/vmessage'
import vmessagebox from '@/components/vmessagebox'
import vnotification from '@/components/vnotification'
import vtabs from '@/components/vtabs'
import vbreadcrumb from '@/components/vbreadcrumb'
import vpageheader from '@/components/vpageheader'
import vdropdown from '@/components/vdropdown'
import vsteps from '@/components/vsteps'
import vdialog from '@/components/vdialog'
import vtooltip from '@/components/vtooltip'
import vpopover from '@/components/vpopover'
import vpopconfirm from '@/components/vpopconfirm'
import vcard from '@/components/vcard'
import vcollapse from '@/components/vcollapse'
import vtimeline from '@/components/vtimeline'
import vdivider from '@/components/vdivider'
import vcalendar from '@/components/vcalendar'
import vimage from '@/components/vimage'
import vDatetimepicket from '@/components/vDatetimepicker'
import vbacktop from '@/components/vbacktop'
import index from '@/views/index'



Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/index', name: 'index', component: index, meta: { path: '/index', name: '首页' },
      children: [
        { path: 'vbreadcrumb', name: 'vbreadcrumb', component: vbreadcrumb },
        { path: 'vbacktop', name: 'vbacktop', component: vbacktop },
        { path: 'vDatetimepicket', name: 'vDatetimepicket', component: vDatetimepicket },
        { path: 'vpageheader', name: 'vpageheader', component: vpageheader },
        { path: 'vdropdown', name: 'vdropdown', component: vdropdown },
        { path: 'vsteps', name: 'vsteps', component: vsteps },
        { path: 'vdialog', name: 'vdialog', component: vdialog },
        { path: 'vtooltip', name: 'vtooltip', component: vtooltip },
        { path: 'vpopover', name: 'vpopover', component: vpopover },
        { path: 'vpopconfirm', name: 'vpopconfirm', component: vpopconfirm },
        { path: 'vcard', name: 'vcard', component: vcard },
        { path: 'vcollapse', name: 'vcollapse', component: vcollapse },
        { path: 'vtimeline', name: 'vtimeline', component: vtimeline },
        { path: 'vdivider', name: 'vdivider', component: vdivider },
        { path: 'vcalendar', name: 'vcalendar', component: vcalendar },
        { path: 'vlvimageink', name: 'vimage', component: vimage },
        { path: 'vradio', name: 'vradio', component: vradio },
        { path: 'vcheckbox', name: 'vcheckbox', component: vcheckbox },
        { path: 'vinput', name: 'vinput', component: vinput },
        { path: 'vinputnumber', name: 'vinputnumber', component: vinputnumber },
        { path: 'vselect', name: 'vselect', component: vselect },
        { path: 'vcascader', name: 'vcascader', component: vcascader },
        { path: 'vswtch', name: 'vswtch', component: vswtch },
        { path: 'vslider', name: 'vslider', component: vslider },
        { path: 'vtimepicker', name: 'vtimepicker', component: vtimepicker },
        { path: 'vdatepicker', name: 'vdatepicker', component: vdatepicker },
        { path: 'vupload', name: 'vupload', component: vupload },
        { path: 'vrate', name: 'vrate', component: vrate },
        { path: 'vcolorpicker', name: 'vcolorpicker', component: vcolorpicker },
        { path: 'vtransfer', name: 'vtransfer', component: vtransfer },
        { path: 'vform', name: 'vform', component: vform },
        { path: 'vtag', name: 'vtag', component: vtag },
        { path: 'vtable', name: 'vtable', component: vtable },
        { path: 'vprocess', name: 'vprocess', component: vprocess },
        { path: 'vtree', name: 'vtree', component: vtree },
        { path: 'vpagination', name: 'vpagination', component: vpagination },
        { path: 'vbadge', name: 'vbadge', component: vbadge },
        { path: 'vavatar', name: 'vavatar', component: vavatar },
        { path: 'vlink', name: 'vlink', component: vlink },
        { path: 'vloading', name: 'vloading', component: vloading },
        { path: 'valert', name: 'valert', component: valert },
        { path: 'vmessage', name: 'vmessage', component: vmessage },
        { path: 'vmessagebox', name: 'vmessagebox', component: vmessagebox },
        { path: 'vnotification', name: 'vnotification', component: vnotification },
        { path: 'vtabs', name: 'vtabs', component: vtabs },
        { path: "vbutton", name: "vbutton", component: vbutton },
        {
          path: 'home', name: 'Home', component: Home, meta: [
            { name: 'home目录' },]
        },
        { path: 'carousels', name: 'Vcarousels', component: Vcarousel },
      ]
    },
    { path: '/login', name: 'Login', component: Login },
    { path: '/404', name: 'notFound', component: notFound },
    { path: '/', redirect: "/index" }
  ]
})
//获取原型对象上的push函数
const originalPush = Router.prototype.push
//修改原型对象中的push方法
Router.prototype.push = function push(location) {
  return originalPush.call(this, location).catch(err => err)
}