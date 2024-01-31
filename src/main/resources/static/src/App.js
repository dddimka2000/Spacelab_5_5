import React, {useState} from 'react';
import ClassCounter from "./components/ClassCounter";
import './styles/App.css';
import MyButton from "./components/UI/button/MyButton";
import MyInput from "./components/UI/input/MyInput";
import MyForm from "./components/UI/MyForm";

function App() {
    const [likes, setLikes] = useState(5);
    const [value, setValue] = useState('text in input');
    function increment() {
        setLikes(likes + 1);
        console.log(likes)
    }
    function decrement() {
        setLikes(likes - 1)
        console.log(likes)
    }


    const [posts, setPosts] = useState([
        {id: 1, title: 'test1', body: '123'},
        {id: 2, title: 'test2', body: '222'},
        {id: 3, title: 'test3', body: '321'}
    ])
    const createPost = (newPost) => {
        setPosts([...posts,newPost])
    }


    return (
        <div className="App">

            <h1>{likes}</h1>
            <h1>{value}</h1>

            <MyForm create={createPost}></MyForm>



            <MyInput type="text"
                     value={value}
                     onChange={event => setValue(event.target.value)}/>
            <br/>




            <MyButton onClick={increment}>+</MyButton>
            <MyButton onClick={decrement}>-</MyButton>
            {/*<ClassCounter/>*/}
            {/*<Counter/>*/}
            {/*<Counter/>*/}
            {/*<Counter/>*/}
        </div>
    );
}

export default App;