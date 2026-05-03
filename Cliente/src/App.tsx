import { BrowserRouter as Router, Routes, Route, useLocation } from 'react-router-dom';

import Inicio from './pages/inicio';
import Login from './pages/Login/login';
import Registro from './pages/Login/registro';
import EditarPerfil from './pages/Perfil/editarPerfil';
import Header from './componentes/Header/header';

function AppContent() {
  const location = useLocation();

  // 🔥 Rutas donde NO quieres header
  const sinHeader = ["/login", "/registro"];

  return (
    <>
      {!sinHeader.includes(location.pathname) && <Header />}

      <Routes>
        <Route path="/" element={<Inicio />} />
        <Route path="/login" element={<Login />} />
        <Route path="/registro" element={<Registro />} />
        <Route path="/editarPerfil" element={<EditarPerfil />} />
      </Routes>
    </>
  );
}

function App(){
  return(
    <Router>
      <AppContent />
    </Router>
  );
}

export default App;