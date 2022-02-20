import React from 'react';
import TopBar from './TopBar';

import { TOKEN_KEY } from "../constants";

function App() {
  console.dir(useState());
  const [isLoggedIn, setIsLoggedIn] = useState(localStorage.getItem(TOKEN_KEY) ? ture : false);
    
  return (
    <div className="App">
      <TopBar/>
    </div>
  );
}

export default App;
