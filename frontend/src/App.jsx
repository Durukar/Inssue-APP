import { Post }  from './Post';
import { Button } from './Post';
import { Header } from './components/Header';

import './global.css';

export function App() {

  return (
    <div>
      <Header />
      <Post 
        cliente="Lucas Davila" 
        conteudo="Lorem, ipsum dolor sit amet consectetur adipisicing elit. Fugiat earum perspiciatis cum natus quasi animi, repellendus eos modi voluptate explicabo reprehenderit possimus optio libero eveniet sed nemo esse doloribus? Veniam!"
      />

      <Post 
        cliente="Eduardo"
        conteudo="Lorem, ipsum dolor sit amet consectetur adipisicing elit. Fugiat earum perspiciatis cum natus quasi animi, repellendus eos modi voluptate explicabo reprehenderit possimus optio libero eveniet sed nemo esse doloribus? Veniam!"
      />
      <Button />
    </div>
  )
}