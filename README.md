[Insomnia_2026-10-27-16-38-48.yaml](https://github.com/user-attachments/files/34048460/Insomnia_2026-10-27-16-38-48.yaml)
# Take-me.
API REST de recordatorios con Spring Boot
type: collection.insomnia.rest/5.0
schema_version: "5.1"
name: My first collection
meta:
  id: wrk_3cf46ecb35334bc4b3d2a4e3e549608f
  created: 1791483376772
  modified: 1791483376772
  description: ""
collection:
  - url: ""
    name: My first request
    meta:
      id: req_37a439e85eef4b30a012e3a6fee5c537
      created: 1791483376892
      modified: 1793137120955
      isPrivate: false
      description: ""
      sortKey: -1791483376892
    method: PUT
    body:
      mimeType: application/json
      text: |-
        el user2 tiene 10 
        										= ambos tienen la misma cantidad de posts 
        el user5 tiene 10
    parameters:
      - name: cantidad
        value: "1"
    headers:
      - name: Content-Type
        value: application/json
    settings:
      renderRequestBody: true
      encodeUrl: true
      followRedirects: global
      cookies:
        send: true
        store: true
      rebuildPath: true
cookieJar:
  name: Default Jar
  meta:
    id: jar_847757c86f34255281efb6e98c76eb064e147c23
    created: 1791483376778
    modified: 1791483376778
environments:
  name: Base Environment
  meta:
    id: env_847757c86f34255281efb6e98c76eb064e147c23
    created: 1791483376775
    modified: 1791483376775
    isPrivate: false

http://localhost:8080/api/recordatorios

[
	{
		"medicamento": "Medicamento E",
		"fecha": "2026-10-28",
		"hora": "09:00",
		"cantidad": 1,
		"usuarioId": "usuario3",
		"id": "52484114-5a4e-47aa-a80c-1785f4ee0d0c",
		"tomado": false
	},
	{
		"medicamento": "Medicamento B",
		"fecha": "2026-10-27",
		"hora": "12:00",
		"cantidad": 1,
		"usuarioId": "usuario1",
		"id": "a989374c-f5de-4a24-8ca0-7dd49c064a40",
		"tomado": false
	},
	{
		"medicamento": "Medicamento H",
		"fecha": "2026-10-29",
		"hora": "16:00",
		"cantidad": 1,
		"usuarioId": "usuario2",
		"id": "466c3767-cc32-48d6-9584-a534cf39ad37",
		"tomado": false
	},
	{
		"medicamento": "Medicamento A",
		"fecha": "2026-10-27",
		"hora": "08:00",
		"cantidad": 1,
		"usuarioId": "usuario1",
		"id": "f1712b0e-5b39-46df-844e-3608a5959719",
		"tomado": false
	},
	{
		"medicamento": "Medicamento D",
		"fecha": "2026-10-28",
		"hora": "07:00",
		"cantidad": 1,
		"usuarioId": "usuario2",
		"id": "de30fbbc-c2a5-4054-b31a-4597ed75640e",
		"tomado": false
	},
	{
		"medicamento": "Medicamento F",
		"fecha": "2026-10-28",
		"hora": "14:00",
		"cantidad": 2,
		"usuarioId": "usuario3",
		"id": "c60a760a-774b-4163-a1e4-900c8d882823",
		"tomado": false
	},
	{
		"medicamento": "Medicamento I",
		"fecha": "2026-10-30",
		"hora": "10:00",
		"cantidad": 1,
		"usuarioId": "usuario3",
		"id": "6f49764c-7868-4af9-8fdf-fb33144ccee2",
		"tomado": false
	},
	{
		"medicamento": "Medicamento J",
		"fecha": "2026-10-30",
		"hora": "21:00",
		"cantidad": 2,
		"usuarioId": "usuario1",
		"id": "f8a3b0b6-7081-40f6-a562-a4f9ce85641c",
		"tomado": false
	},
	{
		"medicamento": "Medicamento C",
		"fecha": "2026-10-27",
		"hora": "20:00",
		"cantidad": 2,
		"usuarioId": "usuario2",
		"id": "0b276c93-b37c-4b63-a6f7-8be928ecdfdb",
		"tomado": false
	},
	{
		"medicamento": "Medicamento G",
		"fecha": "2026-10-29",
		"hora": "08:30",
		"cantidad": 1,
		"usuarioId": "usuario1",
		"id": "dd82d5e7-50f3-48a6-974a-d4b1d64b4ed9",
		"tomado": false
	}
]
