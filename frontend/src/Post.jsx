export function Post(props) {
  return (
  <div>
    <h1>
      <strong>{props.cliente}</strong>
    </h1>
    <h1>{props.conteudo}</h1>
  </div>
  )
}

export function Button() {
  return <button>Click me</button>
}
// Named Exports
