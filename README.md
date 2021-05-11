# marketWeb_service
# Market -Spring API
Aplicación que permite a través de peticiones http administrar la base
de datos de una tienda.



## Authors

- [@cxrdonx](https://www.github.com/cxrdonx)

  
## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |



  
