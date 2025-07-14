import request from '@/utils/request'

// 查询学生列表
export function listStudent(data) {
  return request({
    url: '/system/student/page',
    method: 'post',
    data: data
  })
}

// 查询学生详细
export function getStudent(id) {
  return request({
    url: '/system/student/info',
    method: 'post',
    data: {id}
  })
}

// 新增学生
export function addStudent(data) {
  return request({
    url: '/system/student/add',
    method: 'post',
    data: data
  })
}

// 修改学生
export function updateStudent(data) {
  return request({
    url: '/system/student/update',
    method: 'post',
    data: data
  })
}

// 删除学生
export function delStudent(id) {
  return request({
    url: '/system/student/delete',
    method: 'post',
    data: {id}
  })
}
