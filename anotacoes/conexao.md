# A conexão
## Recorte do exemplo do projeto (Home.js):
```javascript
const [users, setUsers] = useState([]);

    useEffect(() => {
        loadUsers();
    }, []);

    const loadUsers = async () => {
        const result = await axios.get("http://localhost:8080/users");
        setUsers(result.data);
    };
```

## Como seria outra entidade?
```javascript
const [products, setProducts] = useState([]);

useEffect(() => {
    loadProducts();
}, []);

const loadProducts = async () => {
    const result = await axios.get("http://localhost:8080/products");
    setProducts(result.data);
};
```

## Uso (do exemplo produto) como componentes
```javascript
return (
    <div>
        <h2>Lista de Produtos</h2>
        <ul>
            {products.map((product) => (
                <li key={product.id}>
                    {product.name} - R$ {product.price}
                </li>
            ))}
        </ul>
    </div>
);
```

## Fluxo Completo
* O componente é renderizado pela primeira vez
* O useEffect executa loadUsers()/loadProducts() porque suas dependências estão vazias
* loadUsers()/loadProducts() faz uma chamada assíncrona à API
* Quando a resposta chega, setUsers/setProducts(result.data) atualiza o estado
* A atualização do estado faz o componente rerrenderizar, agora com os dados dos usuários/produtos