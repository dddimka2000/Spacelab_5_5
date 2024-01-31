import React, {useState} from 'react';
import MyInput from "./input/MyInput";
import MyButton from "./button/MyButton";

const PostForm = ({create}) => {
    const [post, setPost] = useState({title: '', body: ''});

    const addNewPost = (e) => {
        e.preventDefault();
        const newPost = {
            ...post, id: Date.now()
        }
        create(newPost)
        setPost({title: '', body: ''});
    }

    return (
        <form>
            <MyInput value={post.title} onChange={e => setPost({...post, title: e.target.value})}
                     type="text"
                     placeholder="Name"></MyInput>
            <MyInput type="text"
                     placeholder="Description"></MyInput>
            <MyButton type={"button"} onClick={addNewPost}>Отправить</MyButton>
        </form>
    );
};

export default PostForm;