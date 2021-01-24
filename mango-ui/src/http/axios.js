import axios from 'axios'
import gconfig from './globalConfig'

const httpClient = axios.create({
    baseURL: gconfig.baseURL,
    timeout: gconfig.Timeout
});

// request 请求器
httpClient.interceptors.request.use(function (config) {
    console.log('request inteceptors')
    return config;
},
    function (error) {
        // 请求发生错误时
        console.log("request : ", error)
        // 判断请求超时
        return Promise.reject(error)
    }
)

// response 响应拦截器
httpClient.interceptors.response.use(
    response => {
        console.log("response interceptors.")
        return response
    },
    err => {
        if (err && err.response) {
            switch (err.response.status) {
                case 400:
                    err.message = '请求错误'
                    break;
                case 401:
                    err.message = '未授权,请登录'
                    break;
            }
        }
        console.log(err)
        return Promise.reject(err) //返回接口返回的错误信息
    }
)

export default httpClient;