# ApiDotourDestinos

Bem-vindo à API **ApiDotourDestinos**! Esta API foi desenvolvida em **Java Spring** e foi feito deploy no Render para fornecer dados de destinos turísticos, incluindo informações como destino, descrição, local, imagem e preço. Esses dados são consumidos pelo projeto DoTour, que foi desenvolvido em React com Next.js.

## Repositório do front-end que está consumindo essa api

O código-fonte do front-end que está consumindo a Api está disponível no seguinte repositório: [DotourConsumindoAPi](https://github.com/1Jeferson/DoTourConsumindoApi).

## Endpoints Disponíveis

### Listar Todos os Destinos

Endpoint para obter a lista completa de destinos turísticos.

- **URL:** `/destinos`
- **Método:** `GET`

### Obter Detalhes de um Destino Específico

Endpoint para obter informações detalhadas sobre um destino específico.

- **URL:** `/destinos/{id}`
- **Método:** `GET`
- **Parâmetros de Path:**
  - `id` (String): Identificador único do destino.

## Estrutura dos Dados

Os dados fornecidos pela API têm o seguinte formato:

```json
{
  "id": 1,
  "destino": "Destino Exemplo",
  "descricao": "Descrição do destino.",
  "local": "Localização do destino.",
  "imgUrl": "url_da_imagem.jpg",
  "preco": 1000.00
}
