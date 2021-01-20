import axios from 'axios'


// request 请求器
axios.interceptors.request.use(
    config => {
        let token = this.$cookies.get("token")
        if (token) {
            config.headers.token = token
        } else {
            console.log("redirect to login..")
        }
        return config;
    },
    error => {
        // 请求发生错误时
        console.log("request : ", error)
        // 判断请求超时
        return Promise.reject(error)
    }
)

// response 响应拦截器
axios.interceptors.response.use(
    response => {
        console.log("response interceptors.")
        return response.data
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
