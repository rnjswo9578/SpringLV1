# SpringLV1
First Spring Poject!1
| Method | URL | Request | Response |
| --- | --- | --- | --- |
| GET | /api/posts | - | {
{
"createdAt": "2022-07-25T12:43:01.226062”,
"modifiedAt": "2022-07-25T12:43:01.226062”,
"id": 1,
"title": "title2",
"content": "content2",
"author": "author2"
},
{
"createdAt": "2022-07-25T12:43:01.226062”,
"modifiedAt": "2022-07-25T12:43:01.226062”,
"id": 2,
"title": "title",
"content": "content",
"author": "author"
}
…
} |

| GET | /api/post/{id} | - | {
"createdAt": "2022-07-25T12:43:01.226062”,
"modifiedAt": "2022-07-25T12:43:01.226062”,
"id": 1,
"title": "title2",
"content": "content2",
"author": "author2"
} |
| POST | /api/post | {
"title" : "title",
"content" : "content",
"author" : "author",
"password" : "password"
} | {
"createdAt": "2022-07-25T12:43:01.226062”,
"modifiedAt": "2022-07-25T12:43:01.226062”,
"id": 1,
"title": "title",
"content": "content",
"author": "author"
} |
| PUT | /api/post/{id} | {
"title" : "title2",
"content" : "content2",
"author" : "author2",
"password" :"password2"
} | {
"createdAt": "2022-07-25T12:43:01.226062”,
"modifiedAt": "2022-07-25T12:43:01.226062”,
"id": 1,
"title": "title2",
"content": "content2",
"author": "author2"
} |
| DELETE | /api/post/{id} | {
"password" :"password"
} | {
"success": true,
} |
