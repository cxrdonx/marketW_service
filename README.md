# marketWeb_service
# Market -Spring API
Aplicación que permite a través de peticiones http administrar la base
de datos de una tienda.



## Authors

- [@cxrdonx](https://www.github.com/cxrdonx)

  
## API Reference with products example

#### Get all products

```http
  GET /market-api/products/all
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|   `all`   | `int`    | **Required**. Your API key |

#### Get product

```http
  GET /market-api/products/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int`    | **Required**. Id of item to fetch |

#### get product by category

```http
  GET /market-api/products/category/{id}
```

|   Parameter   | Type     | Description                       |
|   :--------   | :------- | :-------------------------------- |
| `categoryId`  | `int`    | **Required**. Id of item to fetch |

#### Save a product

```http
  POST /market-api/products/save
```

#### Delete a product
```http
  DELETE /market-api/products/delete/{id}
```

|   Parameter   | Type     | Description                       |
|   :--------   | :------- | :-------------------------------- |
|     `id `     | `int`    | **Required**. Id of item to delete |

  
