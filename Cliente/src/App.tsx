import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import Inicio from './pages/inicio';
import Login from './pages/Login/login';
import Registro from './pages/Login/registro';


function App(){
  return(
    <Router>
      <Routes>
        <Route path="/" element={<Inicio/>}></Route>
        
        <Route path='/login' element={<Login/>}></Route>
        <Route path='/registro' element={<Registro/>}></Route>
      </Routes>
    </Router>
  );
}

export default App;