import Mock from 'mockjs'

Mock.mock('http://localhost/8080/user',{
    'name':'@name',  //随机生成名字
    'email':'@email',   // 随机生成email
    'age|1-10': 5,  // 年龄在1-10之间
})

Mock.mock('http://localhost:8080/menu',{
    'id': '@increment',
    'name':'menu',
    'order|1-20': 5,
})

